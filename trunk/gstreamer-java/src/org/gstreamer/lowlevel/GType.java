/* 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 */

package org.gstreamer.lowlevel;

import com.sun.jna.NativeLong;

/**
 *
 */
public enum GType {
    INVALID                  (0),
    NONE                     (1),
    INTERFACE                (2),
    CHAR                     (3),
    UCHAR                    (4),
    BOOLEAN                  (5),
    INT                      (6),
    UINT                     (7),
    LONG                     (8),
    ULONG                    (9),
    INT64                    (10),
    UINT64                   (11),
    ENUM                     (12),
    FLAGS                    (13),
    FLOAT                    (14),
    DOUBLE                   (15),
    STRING                   (16),
    POINTER                  (17),
    BOXED                    (18),
    PARAM                    (19),
    OBJECT                   (20);

    
    GType(int t) {
        type = t << 2;
    }
    public long longValue() {
        return type;
    }
    public static final GType valueOf(NativeLong type) {
        return valueOf(type.longValue());
    }
    public static final GType valueOf(long type) {
        for (GType t : values()) {
            if (t.type == type) {
                return t;
            }
        }
        return INVALID;
    }
    long type;
}
