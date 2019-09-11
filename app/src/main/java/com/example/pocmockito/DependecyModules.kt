package com.example.pocmockito


import com.example.pocmockito.feature.MainViewModel
import com.example.pocmockito.model.MainRepository
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

object DependecyModules {

  val appModule = module{

      single { MainRepository() }
      viewModel { MainViewModel(get()) }
  }

}