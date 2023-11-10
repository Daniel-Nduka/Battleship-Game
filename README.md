# Battleship-Game
A Java program to implement the Battleship game
# Battleship Game Instruction Manual

## Table of Contents
1. [Introduction](#introduction)
2. [Objective](#objective)
3. [Game Components](#game-components)
    - [Battleships](#battleships)
    - [Board](#board)
    - [Players](#players)
4. [Setup](#setup)
    - [Battleships Placement](#battleships-placement)
    - [Player Boards](#player-boards)
5. [Gameplay](#gameplay)
    - [Taking Turns](#taking-turns)
    - [Hit and Miss](#hit-and-miss)
    - [Sinking a Ship](#sinking-a-ship)
6. [Winning the Game](#winning-the-game)
7. [Customization](#customization)
8. [Acknowledgments](#acknowledgments)

## Introduction
Welcome to the Battleship game! This classic strategy game involves naval combat, where players compete to sink each other's fleet of battleships. This manual will guide you through the rules and gameplay.

## Objective
The main objective of Battleship is to successfully guess the coordinates of most ships on the board and sink them

## Game Components

### Battleships
Each player has to attempt sink fleet of battleships each with a specific size:
- Small Battleship (1 square)
- Medium Battleship (2 squares)
- Large Battleship (3 squares)

### Board
The game is played on a grid-based board. The board is divided into rows and columns, and each intersection represents a coordinate where a ship can be placed or a shot can be fired.

### Players
Two players compete against each other on the same Board

## Setup

### Battleships Placement
1. The battleships are randomly placed on the board
2. The size and number of battleships are predefined (e.g., 3 large, 2 medium, 1 small).
3. Battleships are randomly placed vertically or horizontally on the board, not diagonally.
4. No battleships can overlap or occupy the same square.

### Player Boards
1. The board is marked with rows (labeled 0-9) and columns (labeled 0-9).
2. Unrevealed squares are marked as empty.
3. Hits are marked with an 'X,' and misses are marked with an 'O.'

## Gameplay

### Taking Turns
1. Players take turns to fire a shots board.
2. When it's your turn, enter the coordinates (e.g., 19) to target a specific square.

### Hit and Miss
1. If your shot hits abattleship, it's marked as a hit ('X').
2. If your shot misses, it's marked as a miss ('O').


### Sinking a Ship
1. A battleship is sunk when all its squares are hit.
2. The player announces when they have sunk a ship.
3. A score is allocated to the player that sinks the ship

## Winning the Game
The game ends when all of the battleships on the board are sunk.
The winner is the one sinks the most ships


## Acknowledgments
- This Battleship game is inspired by the classic board game.
- Special thanks to the open-source community for providing resources and inspiration.
