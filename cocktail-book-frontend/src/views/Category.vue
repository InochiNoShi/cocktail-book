<template>
  <div>
    <v-container fluid>
      <v-row no-gutters>
        <v-col cols="8" sm="4" v-for="(category, i) in category" :key="i">
          <v-card min-height="200px">
              <v-card-title>
                {{ category.category_name}}
              </v-card-title>
          </v-card>
        </v-col>
      </v-row>
    </v-container>
  </div>
</template>

<script lang="ts">
import axios from 'axios'
export default {
  name: 'category',
  data: () => ({
    category: []
  }),

  mounted () {
    axios
      .get('http://localhost:8080/category')
      .then(response => {
        this.category = response.data
        console.log(response.data)
      })
      .catch(error => {
        console.log(error)
      }
      )
  }
}
</script>

<style>
.v-card {
  margin-top: 10%;
  margin-left: 10%;
}
</style>
