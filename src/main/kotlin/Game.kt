fun main() {
    val name = "Madrigal"
    var healthPoints = 60
    val isBlessed = true
    val isImmortal = false
    //AURA
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal

    val auraColour = if (!auraVisible) "NONE" else "GREEN"
    println(auraColour)

    val healthStatus = if (healthPoints == 100) "is in excellent condition"

    else if(healthPoints in 90 .. 99) " has a few scratches"

    else if (healthPoints in 75 .. 89)
        if(isBlessed) "has some minor wounds but is blessed and healing quickly"
        else  " has some minor wounds"

    else if (healthPoints in 15 .. 74) "is in awful condition"

    else " looks pretty hurt"


    println("$name $healthStatus")
}

