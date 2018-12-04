# HenCoderPlusHomework - 21



### 根据本地 Library 名称选择依赖

> 我们知道 `rootProject` 代表整个统一的项目，而通过`rootProject#subprojects` 可以轻易的获得该项目下的所有子项目。

* 通过 `rootProject` 的 `subprojects` 属性，写一个可以根据子项目名称选择依赖的方法。

* 可以直接写在`build.gradle` 中也可以写在`buildSrc` 中。（不需要考虑子项目的子项目）





### 通过 Plugin 修改apk文件

> 我们知道通过 `Android Gradle 的 processManifest` 可以轻易的获得 APK merge 后的最终清单文件。

   * 通过获取对应的 Task 对 APK的清单文件进行一些修改，例如为某个 `Activity` 添加一个 `android:launchMode` 属性。

   * 通过上传到本地 `repo` 的方式，将这个`plugin` 通过 `classpath` 依赖使用。

