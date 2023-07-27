package com.graphhopper.jsprit.core.algorithm.recreate;

import com.graphhopper.jsprit.core.problem.job.Job;
import com.graphhopper.jsprit.core.problem.solution.route.VehicleRoute;
import com.graphhopper.jsprit.core.problem.vehicle.VehicleFleetManager;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;


public class InsertionDataUpdaterContext {
    private boolean addAllAvailable;
    private Set<String> initialVehicleIds;
    private VehicleFleetManager fleetManager;
    private JobInsertionCostsCalculator insertionCostsCalculator;
    private TreeSet<VersionedInsertionData> insertionDataSet;
    private int updateRound;
    private Job unassignedJob;

    private Collection<VehicleRoute> routes;

    public boolean isAddAllAvailable() {
        return addAllAvailable;
    }

    public void setAddAllAvailable(boolean addAllAvailable) {
        this.addAllAvailable = addAllAvailable;
    }

    public Set<String> getInitialVehicleIds() {
        return initialVehicleIds;
    }

    public void setInitialVehicleIds(Set<String> initialVehicleIds) {
        this.initialVehicleIds = initialVehicleIds;
    }

    public VehicleFleetManager getFleetManager() {
        return fleetManager;
    }

    public void setFleetManager(VehicleFleetManager fleetManager) {
        this.fleetManager = fleetManager;
    }

    public JobInsertionCostsCalculator getInsertionCostsCalculator() {
        return insertionCostsCalculator;
    }

    public void setInsertionCostsCalculator(JobInsertionCostsCalculator insertionCostsCalculator) {
        this.insertionCostsCalculator = insertionCostsCalculator;
    }

    public TreeSet<VersionedInsertionData> getInsertionDataSet() {
        return insertionDataSet;
    }

    public void setInsertionDataSet(TreeSet<VersionedInsertionData> insertionDataSet) {
        this.insertionDataSet = insertionDataSet;
    }

    public int getUpdateRound() {
        return updateRound;
    }

    public void setUpdateRound(int updateRound) {
        this.updateRound = updateRound;
    }

    public Job getUnassignedJob() {
        return unassignedJob;
    }

    public void setUnassignedJob(Job unassignedJob) {
        this.unassignedJob = unassignedJob;
    }

    public Collection<VehicleRoute> getRoutes() {
        return routes;
    }

    public void setRoutes(Collection<VehicleRoute> routes) {
        this.routes = routes;
    }



}
