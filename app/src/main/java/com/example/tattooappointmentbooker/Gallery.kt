package com.example.tattooappointmentbooker

class Gallery(private var artistName: String, private var artistId: Int) {
    private var imageArray = mutableListOf<String>()

    fun getImages(): MutableList<String> {
        return imageArray
    }

    fun addImage(newImage: String) {
        imageArray.add(newImage)
    }

    fun getArtistName(): String {
        return artistName
    }

    fun removeImage(imageUri: String) {
        imageArray.remove(imageUri)
    }

    fun updateImage(oldImageIndex: Int, newImage: String) {
        imageArray[oldImageIndex] = newImage
    }

    fun getArtistId(): Int {
        return artistId
    }

}
