/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pratap.photoapp.api.albums.service;


import java.util.List;

import com.pratap.photoapp.api.albums.data.AlbumEntity;

public interface AlbumsService {
    List<AlbumEntity> getAlbums(String userId);
}
