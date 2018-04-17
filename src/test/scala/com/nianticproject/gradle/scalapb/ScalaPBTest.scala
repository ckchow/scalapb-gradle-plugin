package com.nianticproject.gradle.scalapb

import java.nio.file.Files

import org.gradle.testkit.runner.GradleRunner
import org.scalatest.WordSpec

//TODO
class ScalaPBTest extends WordSpec {
  "Protoc" should {
    "compile Scala code from the given protos" ignore {
      val testProjectDir = Files.createTempDirectory("scalapbtest")

      val result = GradleRunner.create
        .withProjectDir(testProjectDir.toFile)
        .withArguments("scalapb")
        .withPluginClasspath()
        .build

      val taskResult = result.task(":scalapb")

    }
  }
}
