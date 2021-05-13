<template>
    <v-app-bar app color="#6A76AB" dense dark src="@/assets/PublicHeadBarImage.jpg">
      <template v-slot:img="{ props }">
        <v-img v-bind="props" gradient="to top right, rgba(100,115,201,.7), rgba(25,32,72,.7)" />
      </template>

      <v-toolbar-title>Cocktail-Book</v-toolbar-title>

      <v-spacer></v-spacer>

      <v-btn icon>
        <v-icon>mdi-magnify</v-icon>
      </v-btn>

      <template v-slot:extension>
        <v-tabs align-with-title>
          <v-tab to="/home">Home</v-tab>
          <v-tab to="/category">Kategorien</v-tab>
        </v-tabs>
      </template>
    </v-app-bar>
</template>

<script>
export default {
}
</script>

<style>
</style>
