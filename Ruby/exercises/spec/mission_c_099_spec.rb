require './app/mission_c_099.rb'

describe '面積チェック' do
  describe '出力結果のテスト' do
    let(:missionC099) { MissionC099.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "3 4\n", "2\n", "1\n"
      expect($stdout).to receive(:puts).with(36)
      missionC099.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "4 10\n", "3\n", "4\n", "5\n"
      expect($stdout).to receive(:puts).with(280)
      missionC099.run
    end
  end
end
