package com.github.adangel.cuddlyoctofiesta.services

import com.intellij.openapi.project.Project
import com.github.adangel.cuddlyoctofiesta.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
