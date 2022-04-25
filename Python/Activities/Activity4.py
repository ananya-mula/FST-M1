while True:
    player1 = input("Enter Rock/Paper/Scissors: ")
    player2 = input("Enter Rock/Paper/Scissors: ")
    if player1 == "Rock":
        if player2 == "Scissor":
            print("Player 1 won: Rock beats Scissor")
        elif player2 == "Paper":
            print("Player 2 won: Paper beats Rock")
        else:
            print("Its a draw")
    elif player1 == "Scissor":
        if player2 == "Scissor":
            print("Its a draw")
        elif player2 == "Paper":
            print("Player 1 won: Scissors beats Paper")
        else:
            print("Player 2 won: Rock beats Scissor")
    elif player1 == "Paper":
        if player2 == "Scissor":
            print("Player 2 won: Scissor beats Paper")
        elif player2 == "Rock":
            print("Player 1 won: Paper beats Rock")
        else:
            print("Its a draw")
    else:
        print("Invalid Entry")

    repeat = input("Do you want to play another round? Yes/No: ").lower()
    if repeat == "yes":
        pass
    elif repeat == "no":
        raise SystemExit
    else:
        print("You entered an invalid option. Exiting now.")
        raise SystemExit

