package com.example.a20230140094_roomdatabase.repositori

import com.example.a20230140094_roomdatabase.room.Siswa
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa{

    fun getAllSiswaStream(): Flow<List<Siswa>>

    suspend fun insertSiswa(siswa: Siswa)
}

