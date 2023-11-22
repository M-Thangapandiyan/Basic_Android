package Demo

class VolumeCalculator(var length: Int, var width: Int, var height: Int){

    var volume: Int
        get() = width + height + length
        private set(value) {
            height = (value * 1000) / (width * length)
        }
    var a:Int
        get() = width
        private set(value) {
            height = value
        }
    var d : Int
        get() = height
        private set(value) {
            height = value
    }

}