<template>
  <div>
    <v-container fluid>
      <v-row no-gutters>
        <v-col cols="8" sm="4" v-for="(cocktails, i) in cocktails" :key="i">
          <v-card :img="cocktails.img" min-height="200px" :to="cocktails.path">
              <v-card-title>
                {{ cocktails.name}}
              </v-card-title>
          </v-card>
        </v-col>
      </v-row>
    </v-container>
  </div>
</template>

<script lang="ts">
export default {
  data: () => ({
    cocktails: [
      { id: 1, name: 'Alkoholfrei', path: '/alkoholfrei', img: 'https://picsum.photos/200/200' },
      { id: 2, name: 'Aperitif', path: '/aperitif', img: 'https://picsum.photos/200/200' },
      { id: 3, name: 'Batida', path: '/batida', img: 'https://picsum.photos/200/200' },
      { id: 4, name: 'Kaffee', path: '/kaffee', img: 'https://picsum.photos/200/200' },
      { id: 5, name: 'Digestif', path: '/digestif', img: 'https://picsum.photos/200/200' },
      { id: 6, name: 'Fizz & Collins', path: '/fizzcollins', img: 'https://picsum.photos/200/200' },
      { id: 7, name: 'Flips', path: '/flips', img: 'https://picsum.photos/200/200' },
      { id: 8, name: 'Herzhaft', path: '/herzhaft', img: 'https://picsum.photos/200/200' },
      { id: 10, name: 'Julep', path: '/julep', img: 'https://picsum.photos/200/200' },
      { id: 12, name: 'Punches', path: '/punches', img: 'https://picsum.photos/200/200' },
      { id: 13, name: 'Shortdrink', path: '/shortdrink', img: 'https://picsum.photos/200/200' },
      { id: 14, name: 'Sour', path: '/sour', img: 'https://picsum.photos/200/200' },
      { id: 15, name: 'Tiki', path: '/tiki', img: 'https://picsum.photos/200/200' },
      { id: 16, name: 'Zwei- und Dreiteiler', path: '/zweiunddreiteiler', img: 'https://picsum.photos/200/200' },
      { id: 17, name: 'Champagner & Wein', path: '/champagnerwein', img: 'https://picsum.photos/200/200' },
      { id: 18, name: 'Cognac & Brandy', path: '/cognacbrandy', img: 'https://picsum.photos/200/200' },
      { id: 19, name: 'Gin', path: '/gin', img: 'https://picsum.photos/200/200' },
      { id: 20, name: 'Tequila & Mezcal', path: '/tequilamezcal', img: 'https://picsum.photos/200/200' },
      { id: 22, name: 'Vodka', path: '/vodka', img: 'https://picsum.photos/200/200' },
      { id: 23, name: 'Wermut', path: '/wermut', img: 'https://picsum.photos/200/200' },
      { id: 24, name: 'Whisky', path: '/whisky', img: 'https://picsum.photos/200/200' }
    ]
  })
}
</script>

<style>
.v-card {
  margin-top: 10%;
  margin-left: 10%;
}
</style>
