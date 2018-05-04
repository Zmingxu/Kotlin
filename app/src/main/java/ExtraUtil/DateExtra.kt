package ExtraUtil

import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by Maurice on 2018/5/4.
 */
//返回日期时间字符串
fun Date.getNowDateTime(): String {
    val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    return sdf.format(this)
}

//只返回日期字符串
fun Date.getNowDate(): String {
    val sdf = SimpleDateFormat("yyyy-MM-dd")
    return sdf.format(this)
}

//只返回时间字符串
fun Date.getNowTime(): String {
    val sdf = SimpleDateFormat("HH:mm:ss")
    return sdf.format(this)
}

//只返回详细的时间字符串，精确到毫秒
fun Date.getNowTimeDetail(): String {
    val sdf = SimpleDateFormat("HH:mm:ss.SSS")
    return sdf.format(this)
}

//返回开发指定格式的日期时间字符串
fun Date.getFormatTime(format: String): String {
    val ft: String = format
    val sdf = if (!ft.isEmpty()) SimpleDateFormat(ft)
    else SimpleDateFormat("yyyyMMddHHmmss")
    return sdf.format(this)
}
