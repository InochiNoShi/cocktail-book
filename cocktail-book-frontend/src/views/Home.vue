<template>
  <div>
    <v-container fluid>
      <v-row no-gutters>
        <v-col cols="24" sm="12">
          <PrivatePhotoGalery />
        </v-col>
      </v-row>
      <v-row no-gutters>
        <v-col cols="8" sm="4">
          <PrivateLeftCard />
        </v-col>
        <v-col cols="15" sm="8">
          <v-card>
            <v-card-title class="justify-center">
              Tools
            </v-card-title>
            <v-divider />
            <PrivateCenterCard />
          </v-card>
        </v-col>
      </v-row>
    </v-container>
  </div>
</template>

<script>
import Vue from 'vue'
import PrivateLeftCard from '@/components/Private/PrivateLeftCard.vue'
import PrivateCenterCard from '@/components/Private/PrivateCenterCard.vue'
import PrivatePhotoGalery from '@/components/Private/PrivatePhotoGalery.vue'

export default Vue.extend({
  name: 'Home',
  components: { PrivatePhotoGalery, PrivateLeftCard, PrivateCenterCard }
})
</script>
