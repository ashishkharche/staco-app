package org.jesperancinha.enterprise.staco.jpa.repository

import org.jesperancinha.enterprise.staco.common.domain.CurrencyType
import org.jesperancinha.enterprise.staco.jpa.domain.StaCo
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.kotlin.CoroutineSortingRepository
import org.springframework.data.repository.reactive.ReactiveSortingRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux

interface StaCoSearchRepository : ReactiveSortingRepository<StaCo, Long> {

    fun findStaCosByDescriptionLikeOrYearLikeOrValueLikeOrCurrencyLikeOrDiameterMMLikeOrInternalDiameterMMLikeOrHeightMMLikeOrWidthMMLike(
        description: String,
        year: String,
        value: String,
        currency: CurrencyType,
        diameterMM: String,
        internalDiameterMM: String,
        heightMM: String,
        widthMM: String,
        pageable: Pageable
    ): Flux<StaCo>
}

@Repository
interface StaCoRepository : CoroutineSortingRepository<StaCo, Long>
