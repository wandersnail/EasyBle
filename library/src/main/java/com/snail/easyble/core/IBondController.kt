package com.snail.easyble.core

/**
 * 描述: 连接时配对控制
 * 时间: 2018/5/26 16:36
 * 作者: zengfansheng
 */
interface IBondController {
    fun bond(device: Device): Boolean
}