/*
 * Copyright (C) 2014 Vishal Siramshetty <srmshtty[at]gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.unibonn.vishal.namedentities;

import java.util.List;

/**
 *
 * @author Vishal Siramshetty <srmshtty[at]gmail.com>
 */
public class OntologyTerm {

    private String Name;
    private String Identifier;
    private List<String> Synonyms;

    @Override
    public String toString() {
        return "Name: " + getName() + "\nID: " + getIdentifier();
    }

    public String getName() {
        return Name;
    }

    public String getIdentifier() {
        return Identifier;
    }

    public List<String> getSynonyms() {
        return Synonyms;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setIdentifier(String Identifier) {
        this.Identifier = Identifier;
    }

    public void setSynonyms(List<String> Synonyms) {
        this.Synonyms = Synonyms;
    }

}