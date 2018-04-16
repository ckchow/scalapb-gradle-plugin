package com.nianticproject.gradle.scalapb;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ScalaPBPluginExtension {

    List<String> dependentProtoSources;
    String targetDir;
    // supposed to be a set, but list is specific enough
    List<String> projectProtoSourceDirs;
    String extractedIncludeDir;
    Boolean grpc;

    List<String> getDependentProtoSources() {
        return dependentProtoSources;
    }

    String getTargetDir() {
        return targetDir;
    }

    List<String> getProjectProtoSourceDirs() {
        return projectProtoSourceDirs;
    }

    String getExtractedIncludeDir() {
        return extractedIncludeDir;
    }

    Boolean getGrpc() { return grpc; }

    void setDependentProtoSources(List<String> dependentProtoSources) {
        this.dependentProtoSources = dependentProtoSources;
    }

    void setTargetDir(String targetDir) {
        this.targetDir = targetDir;
    }

    void setProjectProtoSourceDirs(List<String> projectProtoSourceDirs) {
        this.projectProtoSourceDirs = projectProtoSourceDirs;
    }

    void setExtractedIncludeDir(String extractedIncludeDir) {
        this.extractedIncludeDir = extractedIncludeDir;
    }

    void setGrpc(boolean grpc) { this.grpc = grpc; }

    public ScalaPBPluginExtension() {
        this.dependentProtoSources = new ArrayList<String>();
        this.targetDir = "target/scala";
        this.projectProtoSourceDirs = ImmutableList.of("src/main/protobuf");
        this.extractedIncludeDir = "target/external_protos";
        this.grpc = true;
    }
}
