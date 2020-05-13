package com.amazonaws.streamingeventmodel;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Media type of media published to Kinesis video streams. Refer https://www.iana.org/assignments/media-types/media-types.xhtml#audio for media types.
 */
public enum MediaType {
    AUDIO_L16("audio/L16");

    private String mediaType;

    MediaType(final String mediaType) {
        this.mediaType = mediaType;
    }

    // Added for JacksonMapper to override the serialization of enum with field failureReason instead of enum type.
    @JsonValue
    public String getMediaType() {
        return this.mediaType;
    }
}