package com.example.pocmockito

import android.app.Application
import android.content.Context
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.pocmockito.DependecyModules.appModule
import com.example.pocmockito.feature.MainViewModel
import com.example.pocmockito.model.MainRepository
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.core.context.startKoin


import org.koin.test.AutoCloseKoinTest


import org.koin.test.KoinTest
import org.koin.test.check.checkModules
import org.koin.test.inject
import org.mockito.Mockito.mock

class MainViewModelTest : AutoCloseKoinTest() {

   // val mockedAndroidContext = mock(MyApplication::class.java)

   //private val mainViewModel: MainViewModel by inject()
   private lateinit var  mainViewModel: MainViewModel

    @get:Rule
    val rule = InstantTaskExecutorRule()

    @Before
    fun setup(){
        //startKoin { modules (listOf(DependecyModules.appModule)) }

        //startKoin( this@,listOf(appModule))
       // startKoin (mockedAndroidContext, listOf(DependecyModules.appModule)


        /*startKoin{mockedAndroidContext
            modules(getModule())
        }
        */

        //startKoin { modules(listOf(getModule())) }

        //koinApplication { modules(getModule()) }.checkModules()




        //val androidContextModule = applicationContext{
         //   bean { MyApplication::class.java} bind Context::class}




        mainViewModel = MainViewModel(MainRepository())

    }

    @After
    fun after(){
       // stopKoin()
    }

    @Test
    fun testJunitKoin(){

        mainViewModel.getEmail()

        var messageLiveData =mainViewModel.getMessageLiveData()

        assertEquals("Sucesso",messageLiveData.value)
    }

    @Test
    fun testJunitErro(){

        mainViewModel.getEmail()

        var messageLiveData =mainViewModel.getMessageLiveData()

        assertEquals("Sucesso",messageLiveData.value)
    }



     fun getModule() = listOf(appModule)

/* private fun getModules()=  org.koin.dsl.module.module {

         single { MainRepository() }
         viewModel { MainViewModel(get()) }
     }
     */

}