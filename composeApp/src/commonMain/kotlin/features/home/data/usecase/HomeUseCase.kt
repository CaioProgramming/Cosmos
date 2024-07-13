package features.home.data.usecase

import features.home.data.model.HomePage
import service.ServiceResult

interface HomeUseCase {

  suspend  fun fetchHomePage() : ServiceResult<Exception, HomePage>
}