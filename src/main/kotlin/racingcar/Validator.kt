package racingcar

object Validator {
    fun validateUserInput(carNamesList: List<String>) {
        if (carNamesList.any { it.length > 5 }) {
            throw IllegalArgumentException("이름은 5글자 이하로 입력해주세요.")
        }
        val regex = "\\d+".toRegex()
        for (numberCheck in carNamesList){
            if (regex.containsMatchIn(numberCheck)) {
                throw IllegalArgumentException("이름은 문자로만만 입력하세요.")
            }
        }
    }

    fun validateUserTryCount(tryCount: String) {
        if (tryCount.toIntOrNull() == null) {
            throw IllegalArgumentException("유효한 숫자를 입력하세요.")
        }
    }
}