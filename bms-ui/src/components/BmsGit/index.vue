<template>
  <div>
    <svg-icon icon-class="github" @click="goto" />
  </div>
</template>

<script setup lang="ts">
const url = ref('https://bms.local');

function goto() {
  window.open(url.value);
}
</script>
