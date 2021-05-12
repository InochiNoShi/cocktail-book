<template>
  <v-form>
      <v-card>
          <v-card-title>
              {{ title }}
          </v-card-title>
          <v-card-subtitle>
              {{ subtitle }}
          </v-card-subtitle>
            <v-card>
                <v-img src="https://picsum.photos/200/200" />
            </v-card>
      </v-card>
  </v-form>
</template>

<script>
export default {
  data () {
    return {
      title: 'asdflkajsödf',
      subtitle: 'ahsjdfhaöklsdfjaklsdfjö'
    }
  }
}
</script>

<style>

</style>
