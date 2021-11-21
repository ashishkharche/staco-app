package org.jesperancinha.enterprise.engine.dto

import org.jesperancinha.enterprise.staco.common.dto.StaCoDto

data class ResponseDto(
    val staCoDtos: List<StaCoDto>,
    val currentPage: Int,
    val totalRecords: Int,
    val totalPages: Int,
)