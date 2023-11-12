package lotto.domain

enum class LottoRank(val count: Int, val prize: Int) {
    FIRST(6, 2_000_000_000),
    SECOND(5, 1_500_000),
    THIRD(4, 50_000),
    FOURTH(3, 5000),
    MISS(0, 0);

    companion object {
        fun of(count: Int): LottoRank {
            return values().find { it.count == count } ?: MISS
        }
    }
}
