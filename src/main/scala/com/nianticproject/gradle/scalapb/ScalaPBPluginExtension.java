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
    String projectProtoSourceDir;
    String extractedIncludeDir;
    Boolean grpc;

    List<String> getDependentProtoSources() {
        return dependentProtoSources;
    }

    String getTargetDir() {
        return targetDir;
    }

    String getProjectProtoSourceDir() {
        return projectProtoSourceDir;
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

    void setProjectProtoSourceDir(String projectProtoSourceDir) {
        this.projectProtoSourceDir = projectProtoSourceDir;
    }

    void setExtractedIncludeDir(String extractedIncludeDir) {
        this.extractedIncludeDir = extractedIncludeDir;
    }

    void setGrpc(boolean grpc) { this.grpc = grpc; }

    public ScalaPBPluginExtension() {
        this.dependentProtoSources = new ArrayList<String>();
        this.targetDir = "target/scala";
        this.projectProtoSourceDir = "src/main/protobuf";
        this.extractedIncludeDir = "target/external_protos";
        this.grpc = true;
    }
}
