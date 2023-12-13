package com.example.love

data class Message(val messageContent: String, val messageDate: String)

fun processReceivedMessages(receivedMessagesList: List<Message>) {
    val sortedMessages = receivedMessagesList.sortedByDescending { it.messageDate }

    val groupedMessagesByMonthAndYear = sortedMessages.groupBy { getMessageMonthAndYear(it.messageDate) }

    groupedMessagesByMonthAndYear.forEach { (monthYear, messages) ->
        println("Month/Year: $monthYear")
        messages.forEach { message ->
            println("Message: ${message.messageContent}")
        }
        println("------")
    }
}

fun getMessageMonthAndYear(dateString: String): String {
    val parts = dateString.split("-")
    return if (parts.size >= 2) {
        "${getMonthName(parts[1].toInt())} ${parts[0]}"
    } else {
        dateString
    }
}

fun getMonthName(month: Int): String {
    return when (month) {
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> "Invalid Month"
    }
}

