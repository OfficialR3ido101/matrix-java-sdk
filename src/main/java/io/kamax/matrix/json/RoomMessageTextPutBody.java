/*
 * matrix-java-sdk - Matrix Client SDK for Java
 * Copyright (C) 2017 Maxime Dor
 *
 * https://www.kamax.io/
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package io.kamax.matrix.json;

public class RoomMessageTextPutBody {

    private String msgtype = "m.text";
    private String body;

    public RoomMessageTextPutBody(String body) {
        this.body = body;
    }

    public RoomMessageTextPutBody(String msgType, String body) {
        this(body);
        this.msgtype = msgType;
    }

    public String getMsgtype() {
        return msgtype;
    }

    public String getBody() {
        return body;
    }

}
