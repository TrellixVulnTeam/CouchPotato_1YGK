'''
script for xml environment
'''
import random


class Mission:
    def __init__(self):
        self._SIZE = 50
        self._DENSITY = 0.001

    def spawn_type(self, type):
        result_xml = ""
        for _ in range(int((self._SIZE*2)**2*self._DENSITY)):
            xd, zd = random.randint(-self._SIZE,
                                    self._SIZE), random.randint(-self._SIZE, self._SIZE)
            result_xml += "<DrawEntity x='{}' y='4' z='{}' type='{}'/>".format(
                xd, zd, type)
        return result_xml

    def GetMission(self):

        return '''
        <?xml version="1.0" encoding="UTF-8" standalone="no" ?>
        <Mission xmlns="http://ProjectMalmo.microsoft.com" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">

        <About>
            <Summary>Environment Description</Summary>
        </About>

        <ServerSection>
            <ServerInitialConditions>
                <Time>
                    <StartTime>6000</StartTime>
                    <AllowPassageOfTime>true</AllowPassageOfTime>
                </Time>
                <Weather>normal</Weather>
                <AllowSpawning>true</AllowSpawing>
            </ServerInitialConditions>
            <ServerHandlers>
                <FlatWorldGenerator generatorString="3;7,2*3,2;1;biome_1,village(size=33 distance=15),lake,lava_lake"/>
                <DrawingDecorator>''' +  \
            "<DrawCuboid x1='{}' x2='{}' y1='2' y2='5' z1='{}' z2='{}' type='air'/>".format(-self._SIZE, self._SIZE, -self._SIZE, self._SIZE) + \
            "<DrawCuboid x1='{}' x2='{}' y1='1' y2='4' z1='{}' z2='{}' type='stone'/>".format(-self._SIZE, self._SIZE, -self._SIZE, self._SIZE) + \
            self.spawn_type('Pig') + \
            '''</DrawingDecorator>
                <ServerQuitWhenAnyAgentFinishes/>
            </ServerHandlers>
        </ServerSection>
        
         <AgentSection mode="Creative">
            <Name>Environment Description</Name>
            <AgentStart>
                <Placement x="0.5" y="4" z="0.5" yaw="0"/>
            </AgentStart>
            <AgentHandlers>
                <ObservationFromFullStats/>
                    <ContinuousMovementCommands turnSpeedDegs="180"/>
            </AgentHandlers>
        </AgentSection>
        </Mission>
        '''
