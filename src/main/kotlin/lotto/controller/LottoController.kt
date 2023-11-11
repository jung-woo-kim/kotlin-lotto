package lotto.controller

import lotto.domain.*
import lotto.view.InputView
import lotto.view.OutputView

class LottoController {

    fun run() {
        val money = InputView.getBuyingMoney()
        val lottoMachine = LottoMachine(LottoMoney(money), RandomLottoNumbersGenerator)
        OutputView.printBuyingResult(lottoMachine.getLottos())

        OutputView.printRequestInputWinningLotto()
        val winningLotto = WinningLotto(Lotto(InputView.getWinningLottoNumbers().map { LottoNumber(it) }))
        val lottoResult = lottoMachine.getLottoResult(winningLotto)
        OutputView.printLottoRanks(lottoResult.lottoRanks)
        OutputView.printEarningRate(lottoResult.earningRate)
    }
}
