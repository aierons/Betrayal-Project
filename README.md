Please note that this is unofficially licensed and is created by geeks who would like to play this amazing board game without being in the same physical place. 

This game will be developed in Unity. 

# Setup 
Tile Prefab
- Texture
- Possible Floors

tile
transform
current coordinate
current floor
players
north, south, east, west tiles
list of other edges
cardtype (can be null)

Controller prefab
undirected graph of tiles
list of edges
turn controller 
list of active players/characters
- public get player i
list of unused tiles
haunt counter
haunt


cardtype enum
Item, Event, Omen

card
name
description
target player(s) - function that returns true for affected players
persists - boolean marks if card should remain active post end of turn
onDraw - function called on draw, parameters: player that drew the card, haunt/not haunt
onDiscard - function called on discard, parameters: players current affected by card, rolls (if any)

a haunt is a proxy

player/character
name
bday
stats
coordinate + current tile
