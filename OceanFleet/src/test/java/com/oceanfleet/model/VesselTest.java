
package com.oceanfleet.model;

import com.oceanfleet.model.Vessel;
import com.oceanfleet.util.VesselUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VesselTest {

    private VesselUtil vesselUtil;
    private Vessel vessel1;
    private Vessel vessel2;
    private Vessel vessel3;

    @BeforeEach
    void setUp() {

        vesselUtil = new VesselUtil();

        vessel1 = new Vessel(
                "V001", "Sea King", 25.5, "Cargo"
        );

        vessel2 = new Vessel(
                "V002", "Ocean Star", 18.0, "Tanker"
        );

        vessel3 = new Vessel(
                "V003", "Wave Rider", 22.3, "Cruise"
        );

        vesselUtil.addVesselPerformance(vessel1);
        vesselUtil.addVesselPerformance(vessel2);
        vesselUtil.addVesselPerformance(vessel3);
    }

    @Test
    void testGetVesselByIdWhenVesselExists() {

        Vessel result = vesselUtil.getVesselById("V002");

        assertNotNull(result);
        assertSame(vessel2, result);
        assertEquals("Ocean Star", result.getVesselName());
    }

    @Test
    void testGetFirstVesselById() {

        Vessel result = vesselUtil.getVesselById("V001");

        assertSame(vessel1, result);
    }

    @Test
    void testGetLastVesselById() {

        Vessel result = vesselUtil.getVesselById("V003");

        assertSame(vessel3, result);
    }

    @Test
    void testGetVesselByIdWhenVesselDoesNotExist() {

        Vessel result = vesselUtil.getVesselById("V004");

        assertNull(result);
    }

    @Test
    void testVesselIdSearchIsCaseSensitive() {

        Vessel result = vesselUtil.getVesselById("v001");

        assertNull(result);
    }

    @Test
    void testSearchInEmptyVesselList() {

        VesselUtil emptyVesselUtil = new VesselUtil();

        Vessel result = emptyVesselUtil.getVesselById("V001");

        assertNull(result);
    }
}