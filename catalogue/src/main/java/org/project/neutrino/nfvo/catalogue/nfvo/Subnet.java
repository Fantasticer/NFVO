package org.project.neutrino.nfvo.catalogue.nfvo;

import org.project.neutrino.nfvo.catalogue.util.IdGenerator;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

/**
 * Created by mpa on 28.05.15.
 */
@Entity
public class Subnet {
    @Id
    private String id = IdGenerator.createUUID();
    @Version
    private int version = 0;
    private String name;
    private String extId;
    private String networkId;
    private String cidr;

    public String getId() { return id; }

    public int getVersion() { return version; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtId() {
        return extId;
    }

    public void setExtId(String extId) {
        this.extId = extId;
    }

    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public String getNetworkId() {
        return networkId;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    @Override
    public String toString() {
        return "Subnet{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", version='" + version +
                ", extId='" + extId + '\'' +
                ", networkId='" + networkId + '\'' +
                ", cidr='" + cidr + '\'' +
                '}';
    }
}