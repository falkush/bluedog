input = {};

savestate.loadslot(1);
for j=0,785 do
	emu.frameadvance();
	emu.frameadvance();
	emu.frameadvance();
end

while true do
	emu.frameadvance();
	emu.frameadvance();
	emu.frameadvance();

	input['P1 A'] = true;
	joypad.set(input);
	emu.frameadvance();
	input['P1 A'] = false;
	joypad.set(input);
	emu.frameadvance();

	while true do
		emu.frameadvance();
	end
end