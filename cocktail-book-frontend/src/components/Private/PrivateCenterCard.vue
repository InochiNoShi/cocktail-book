<template>
  <div>
      <v-row v-for="(tools, i) in tools" :key="i" no-gutters>
        <v-col>
          <v-card elevation="0">
            <v-card-title class="justify-center">
              {{ tools.tool_name }}
            </v-card-title>
            <v-row no-gutters>
              <v-col cols="24" sm="12">
                <v-card elevation="0">
                  <v-row no-gutters align="start">
                    <v-col cols="4" sm="2">
                      <v-img src=" https://picsum.photos/seed/picsum/200/300" class="ml-3"/>
                    </v-col>
                    <v-col cols="20" sm="10">
                      <v-card-text> {{ tools.tool_description }} </v-card-text>
                    </v-col>
                  </v-row>
                </v-card>
              </v-col>
            </v-row>
          </v-card>
        </v-col>
        <v-divider />
      </v-row>
  </div>
</template>

<script>
import axios from 'axios'
export default {
  name: 'PrivateCenterCard',
  data: () => ({ tools: [] }),
  mounted () {
    axios
      .get('http://localhost:8080/tools')
      .then(response => (this.tools = response.data))
      .catch(error => (console.log(error)))
  }
}
</script>

<style>

</style>
