<template>
  <v-app>
    <PublicHeadBar />
    <v-main>
      <router-view />
    </v-main>
  </v-app>
</template>

<script lang="ts">
import Vue from 'vue'
import PublicHeadBar from '@/components/Public/PublicHeadBar.vue'

export default Vue.extend({
  name: 'App',
  components: { PublicHeadBar },

  data: () => ({
  })
})
</script>
