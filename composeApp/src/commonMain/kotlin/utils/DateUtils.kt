package utils

import androidx.compose.ui.text.capitalize
import androidx.compose.ui.text.intl.Locale
import kotlinx.datetime.Clock
import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDate.Companion.Format
import kotlinx.datetime.LocalTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.UtcOffset
import kotlinx.datetime.format.*
import kotlinx.datetime.toLocalDateTime

@OptIn(FormatStringsInDatetimeFormats::class)
object DateUtils {
    fun getDateText(formatter: DateTimeFormat<DateTimeComponents> = DateTimeComponents.Formats.ISO_DATE_TIME_OFFSET) =
        formatter.format {
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

enum class DateFormats(val format: DateTimeFormat<DateTimeComponents>, val localDateFormat: DateTimeFormat<LocalDate>? = null) {
    DD_OF_MMM_YYY(
        format =
            DateTimeComponents.Format {

                dayOfMonth(Padding.NONE)
                chars(" de ")
                monthName(MonthNames(names = MonthDescriptions.ptBRMonths))
                chars(", ")
                year()
            },
        localDateFormat =
            Format {
                dayOfMonth(Padding.NONE)
                chars(" de ")
                monthName(MonthNames(names = MonthDescriptions.ptBRMonths))
                chars(", ")
                year()
            },
    ),

    DD_OF_MMM(
        format =
            DateTimeComponents.Format {

                dayOfMonth(Padding.NONE)
                chars(" de ")
                monthName(MonthNames(names = MonthDescriptions.ptBRMonths))
            },
        localDateFormat =
            Format {
                dayOfMonth(Padding.NONE)
                chars(" de ")
                monthName(MonthNames(names = MonthDescriptions.ptBRMonths))
            },
    ),
    DD_MM(
        format =
            DateTimeComponents.Format {

                dayOfMonth(Padding.NONE)
                chars("\n")
                monthName(MonthNames(names = MonthDescriptions.abreviatedBRMonths))
            },
        localDateFormat =
            Format {
                dayOfMonth(Padding.NONE)
                chars("\n")
                monthName(MonthNames(names = MonthDescriptions.abreviatedBRMonths))
            },
    ),

    EE_DD_OF_MMM(
        format =
            DateTimeComponents.Format {
                dayOfWeek(DayOfWeekNames(names = WeekdayDescriptions.ptBRWeekdays))
                chars(", ")
                dayOfMonth(Padding.NONE)
                chars(" de ")
                monthName(MonthNames(names = MonthDescriptions.ptBRMonths))
            },
        localDateFormat =
            Format {
                dayOfWeek(DayOfWeekNames(names = WeekdayDescriptions.ptBRWeekdays))
                chars(", ")
                dayOfMonth(Padding.NONE)
                chars(" de ")
                monthName(MonthNames(names = MonthDescriptions.ptBRMonths))
            },
    ),

    DATE_DAY_MONTH(
        format =
            DateTimeComponents.Format {
                monthName(MonthNames(names = MonthDescriptions.abreviatedBRMonths))
                chars("\n")
                dayOfMonth(Padding.NONE)

            },
        localDateFormat =
            Format {
                monthName(MonthNames(names = MonthDescriptions.abreviatedBRMonths))
                chars("\n")
                dayOfMonth(Padding.NONE)
            },
    ),
}

object MonthDescriptions {
    val ptBRMonths =
        listOf(
            "janeiro",
            "fevereiro",
            "março",
            "abril",
            "maio",
            "junho",
            "julho",
            "agosto",
            "setembro",
            "outubro",
            "novembro",
            "dezembro",
        ).map { it.capitalize(Locale.current) }

    val abreviatedBRMonths =
        listOf(
            "jan",
            "fev",
            "mar",
            "abr",
            "mai",
            "jun",
            "jul",
            "ago",
            "set",
            "out",
            "nov",
            "dez",
        ).map { it.capitalize(Locale.current) }
}

object WeekdayDescriptions {
    val ptBRWeekdays =
        listOf(
            "domingo",
            "segunda-feira",
            "terça-feira",
            "quarta-feira",
            "quinta-feira",
            "sexta-feira",
            "sábado",
        ).map { it.capitalize(Locale.current) }

    val ptBRAbreviatedWeekDays =
        listOf(
            "dom",
            "seg",
            "ter",
            "qua",
            "qui").map { it.capitalize(Locale.current) }
}
