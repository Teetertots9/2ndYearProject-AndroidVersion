package com.example.tattooappointmentbooker

import org.junit.Test

import org.junit.Assert.*

class GalleryUnitTests {
    private val gallery = Gallery("Alice", 111)

    @Test
    fun getImagesFromGallery() {
        assertNotNull(gallery.getImages())
    }

    @Test
    fun addImageToGallery() {
        gallery.addImage("image1")
        assertEquals(gallery.getImages().size, 1)
    }

    @Test
    fun getGalleryArtist() {
        assertEquals(gallery.getArtistName(), "Alice")
    }

    @Test
    fun deleteGalleryImage() {
        addImageToGallery()
        gallery.removeImage("image1")
        assertEquals(gallery.getImages().size, 0)
    }

    @Test
    fun updateGalleryImage() {
        addImageToGallery()
        gallery.updateImage(0, "image2")
        assertEquals(gallery.getImages()[0], "image2")
    }

    @Test
    fun getArtistIdFromGallery(){
        assertEquals(gallery.getArtistId(), 111)
    }

}
