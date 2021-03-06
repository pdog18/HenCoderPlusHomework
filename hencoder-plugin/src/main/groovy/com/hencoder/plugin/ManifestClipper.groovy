package com.hencoder.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class ManifestClipper implements Plugin<Project> {

    @Override
    void apply(Project project) {
        def android = project.extensions.android
        android.applicationVariants.all { variant ->
            variant.outputs.all { output ->
                output.processManifest.doLast {
                    String manifestPath = "$manifestOutputDirectory/AndroidManifest.xml"

                }
            }
        }
    }
/*
    private static void updateManifest(File androidManifestFile) {
        def fileReader = new FileReader(androidManifestFile)
        def androidManifestXmlNode = new XmlParser().parse(fileReader)

        updateActivityNode(androidManifestXmlNode, "launchMode", "singleTask")

        // Write the manifest file
        def pw = new PrintWriter(androidManifestFile)
        new XmlNodePrinter(pw).print(androidManifestXmlNode)
    }

    private static void updateActivityNode(Node androidManifest, String key, String value) {
        def components = androidManifest.getAt(new QName("application")).getAt(new QName("activity"))
        def attributeKey = new QName("http://schemas.android.com/apk/res/android", key, "android")

        components.each {
            if (it.attribute(attributeKey) == null) {
                it.attributes()[attributeKey] = value
            }
        }
    }*/
}