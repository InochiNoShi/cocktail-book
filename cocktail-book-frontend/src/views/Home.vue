<template>
  <div>
    <v-container fluid>
      <v-row no-gutters>
        <v-col cols="24" sm="12">
          <PrivatePhotoGalery />
        </v-col>
      </v-row>
      <v-row no-gutters>
        <v-col cols="24" sm="12">
          <v-card>
            <v-card-title>title</v-card-title>
            <v-card-subtitle>subtitle</v-card-subtitle>
            <v-card-text>kleiner text</v-card-text>
          </v-card>
        </v-col>
      </v-row>
    </v-container>
  </div>
</template>

<script lang="ts">
import Vue from 'vue'
import PrivatePhotoGalery from '@/components/Private/PrivatePhotoGalery.vue'

export default Vue.extend({
  name: 'Home',
  components: { PrivatePhotoGalery }
})
</script>
