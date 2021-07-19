package com.github.krizzmp.jetbrainsstorybook.services

import com.github.krizzmp.jetbrainsstorybook.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
