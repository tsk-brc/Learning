require './app/mission_c_101.rb'

describe '幸運日チェック' do
  describe '出力結果のテスト' do
    let(:missionC101) { MissionC101.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "15\n"
      expect($stdout).to receive(:puts).with(14)
      missionC101.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "128\n"
      expect($stdout).to receive(:puts).with(1)
      missionC101.run
    end

    it 'テスト3' do
      allow($stdin).to receive(:gets).and_return "6\n"
      expect($stdout).to receive(:puts).with(68)
      missionC101.run
    end
  end
end
