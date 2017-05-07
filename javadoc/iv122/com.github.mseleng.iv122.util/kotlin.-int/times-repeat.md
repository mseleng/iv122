---
title: timesRepeat - iv122
---

[iv122](../../index.md) / [com.github.mseleng.iv122.util](../index.md) / [kotlin.Int](index.md) / [timesRepeat](.)

# timesRepeat

`fun Int.timesRepeat(block: (Int) -> Unit): Unit`

Syntactic sugar, which is more readable and simplifies for loops

for(i in 1..5) { ... } becomes 5.timesRepeat { ... }

### Parameters

`block` - block to execute in each iteration