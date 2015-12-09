// !CHECK_TYPE

//KT-1558 Exception while analyzing
package j

fun <T : Any> T?.sure() : T = this!!

fun <E> List<*>.toArray(ar: Array<E>): Array<E> = ar

fun testArrays(ci: List<Int?>, cii: List<Int?>?) {
    val c1: Array<Int?> = cii.sure().toArray(<!FUNCTION_CALL_EXPECTED!><!INVISIBLE_MEMBER!>Array<!><Int?><!>)

    val c2: Array<Int?> = ci.toArray(<!INVISIBLE_MEMBER!>Array<!><Int?>())

    val c3 = <!INVISIBLE_MEMBER!>Array<!><Int?>()

    val c4 = ci.toArray<Int?>(<!INVISIBLE_MEMBER!>Array<!><Int?>())

    val c5 = ci.toArray(<!INVISIBLE_MEMBER!>Array<!><Int?>())

    checkSubtype<Array<Int?>>(c1)
    checkSubtype<Array<Int?>>(c2)
    checkSubtype<Array<Int?>>(c3)
    checkSubtype<Array<Int?>>(c4)
    checkSubtype<Array<Int?>>(c5)
}