<template>
  <v-carousel
    cycle
    height="400"
    hide-delimiter-background
    show-arrows-on-hover
  >
    <v-carousel-item
      v-for="(cocktail, i) in cocktail"
      :key="i"
      max=1
    >
      <v-sheet
        :color="colors[i]"
        height="100%"
      >
        <v-row
          class="fill-height"
          align="center"
          justify="center"
        >
          <div class="display-3">
            {{ cocktail.cocktail_name }}
          </div>
        </v-row>
      </v-sheet>
    </v-carousel-item>
  </v-carousel>
</template>

<script>
import axios from 'axios'
export default {
  data () {
    return {
      colors: [
        'indigo',
        'warning',
        'pink darken-2',
        'red lighten-1',
        'deep-purple accent-4'
      ],
      cocktail: []
    }
  },
  mounted () {
    axios
      .get('http://localhost:8080/cocktail')
      .then(response => (this.cocktail = response.data))
      .catch(error => (console.log(error)))
  }
}
</script>

<style>
</style>
