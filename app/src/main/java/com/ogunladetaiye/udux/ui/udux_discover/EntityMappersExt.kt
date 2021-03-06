package com.ogunladetaiye.udux.ui.udux_discover

import com.ogunladetaiye.udux.data.cache.entities.MagicPlaylistEntity
import com.ogunladetaiye.udux.data.cache.entities.NewMusicEntity
import com.ogunladetaiye.udux.data.cache.entities.TrendingEntity
import com.ogunladetaiye.udux.ui.udux_discover.discover_view_sections.MagicPlaylistItem
import com.ogunladetaiye.udux.ui.udux_discover.discover_view_sections.NewMusicItem
import com.ogunladetaiye.udux.ui.udux_discover.discover_view_sections.TrendingItem

fun List<MagicPlaylistEntity>.toMagicPlaylistItem():List<MagicPlaylistItem>{
    return this.map {
        MagicPlaylistItem(it)
    }
}

fun List<TrendingEntity>.toTrendingListItem():List<TrendingItem>{
    return this.map {
        TrendingItem(it)
    }
}

fun List<NewMusicEntity>.toNewMusicItem():List<NewMusicItem>{
    return this.map {
        NewMusicItem(it)
    }
}