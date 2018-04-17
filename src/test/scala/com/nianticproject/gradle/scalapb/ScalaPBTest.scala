package com.nianticproject.gradle.scalapb

import java.io.File

import org.scalatest.{Matchers, WordSpec}
import org.gradle.testkit.runner.BuildResult
import org.gradle.testkit.runner.GradleRunner
import org.scalatest.WordSpec
import java.io._
import java.nio.file.Files

import org.gradle.api.internal.GradleInternal
import org.gradle.api.internal.initialization.ClassLoaderScope
import org.gradle.api.internal.project.{DefaultProject, ProjectInternal}
import org.gradle.groovy.scripts.ScriptSource
import org.gradle.internal.service.scopes.ServiceRegistryFactory
import org.gradle.testfixtures.ProjectBuilder
import org.gradle.testkit.runner.TaskOutcome._
import org.junit.Rule
import org.junit.rules.TemporaryFolder
import org.scalatest.junit.JUnitSuite

//TODO
class ScalaPBTest extends WordSpec {

//  val _testProjectDir = new TemporaryFolder()
//
//  @Rule
//  def testProjectDir = _testProjectDir


  "Protoc" should {
    "compile Scala code from the given protos" in {
//      val testProjectDir = new TemporaryFolder()
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
