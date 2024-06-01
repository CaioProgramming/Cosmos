package utils

import androidx.compose.ui.text.capitalize
import androidx.compose.ui.text.intl.Locale
import kotlinx.datetime.Clock
import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDate.Companion.Format
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.LocalTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.UtcOffset
import kotlinx.datetime.format
import kotlinx.datetime.format.*
import kotlinx.datetime.toLocalDateTime

@OptIn(FormatStringsInDatetimeFormats::class)
object DateUtils {

    fun getDateText(formatter : DateTimeFormat<DateTimeComponents> = DateTimeComponents.Formats.ISO_DATE_TIME_OFFSET) = formatter.format {
        // the receiver of this lambda is DateTimeComponents
        val now: Instant = Clock.System.now()
        val thisTime: LocalTime = now.toLocalDateTime(TimeZone.currentSystemDefault()).time
        setDate(now.toLocalDateTime(TimeZone.currentSystemDefault()).date)
        hour = thisTime.hour
        minute = thisTime.minute
        second = thisTime.second
        setOffset(UtcOffset(hours = 2))
    }

}


fun DateFormats.getFormatted() = DateUtils.getDateText(this.format)

enum class DateFormats(val format:  DateTimeFormat<DateTimeComponents>) {
    DATE_DAY_OF_MONTH_YEAR (format = DateTimeComponents.Format {

        dayOfMonth(Padding.NONE)
        chars(" de ")
        monthName(kotlinx.datetime.format.MonthNames(names = MonthDescriptions.ptBRMonths))
        chars(", ")
        year()
    })
}


object MonthDescriptions {

    val ptBRMonths = listOf(
        "janeiro", "fevereiro", "março", "abril", "maio", "junho",
        "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"
    ).map { it.capitalize(Locale.current) }

}