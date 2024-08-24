<script setup>

</script>

<template>
  <div style="width: 100vw; height: 100vh; overflow: hidden; display: flex">
    <div style="flex: 1; background-color: black">
      <el-image style="width: 100%; height: 100%" fit="cover"
          src="src/assets/images/bg.png"></el-image>
    </div>
    <div class="welcome-title">
      <div style="font-size: 30px; font-weight: bold">欢迎来到本测试网站</div>
      <div style="margin-top: 10px">在这里可以学习如何搭建网站</div>
      <div style="margin-top: 5px">Designed by @Renai</div>
    </div>
    <div class="right-card">
      <router-view v-slot="{ Component }">
        <transition name="el-fade-in-linear" mode="out-in">
          <component :is="Component"/>
        </transition>
      </router-view>
    </div>
  </div>
</template>

<style scoped>

.welcome-title {
  position: absolute;
  bottom: 30px;
  left: 30px;
  color: white;
  text-shadow: 0 0 10px black;
}

.right-card {
  width: 400px;
  z-index: 1;
  background-color: white;
}
</style>