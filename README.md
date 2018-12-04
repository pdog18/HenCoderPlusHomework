# HenCoderPlusHomework - 21



### 根据本地 Library 名称选择依赖

> 我们知道 `rootProject` 代表整个统一的项目，而通过`rootProject#subprojects` 可以轻易的获得该项目下的所有子项目。

* 通过 `rootProject` 的 `subprojects` 属性，写一个可以根据子项目名称选择依赖的方法。

* 可以直接写在`build.gradle` 中也可以写在`buildSrc` 中。（不需要考虑子项目的子项目）




##### 举例
项目结构如下

```
rootProject {
    :app
    :library-1
    :library-2
    :hencoder-plugin
}
```

在 `app#build.gradle` 中编写代码，让`app` 依赖`library-1` 、 `library-2` 但是不依赖 `hencoder-plugin`








### 通过 Plugin 修改apk文件

> 我们知道通过 `Android Gradle 的 processManifest` 可以轻易的获得 APK merge 后的最终清单文件。

   * 通过获取对应的 Task 对 APK的清单文件进行一些修改。

   * 通过上传到本地 `repo` 的方式，将这个`plugin` 通过 `classpath` 依赖使用。



#### 举例

创建一个 `plugin` ，在使用改`plugin` 的`project` 中，找到`processManifest` Task，在他的`doLast{}` 中，对清单文件中的所有`Activity` ，全部添加一个 `android:launchMode` 属性。